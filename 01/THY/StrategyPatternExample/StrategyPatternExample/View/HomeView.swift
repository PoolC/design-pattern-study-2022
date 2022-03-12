//
//  HomeView.swift
//  StrategyPatternExample
//
//  Created by 유태호 on 2022/03/10.
//



import SwiftUI

struct HomeView: View {
	@State var accRate1 = 1.0
	@State var accRate2 = 2.0
	
	@State private var strategyAlgorithm : VelocityStrategy?
	
	func execute() {
		self.strategyAlgorithm?
			.apply(foregroundVelocityCoefficient: &accRate1, backgroundVelocityCoefficient: &accRate2)
	}
	
	func setStrategy(strategy: VelocityStrategy) {
		self.strategyAlgorithm = strategy
	}
	
    var body: some View {
		ZStack {
			Color(.white)
				.ignoresSafeArea(.all)
			WaveForm(color: .blue.opacity(0.6), amplify : 150, accRate: $accRate1)
			WaveForm(color: .blue.opacity(0.8), amplify : 100, accRate: $accRate2)
			VStack(spacing: 20) {
				HStack {
					Spacer()
					
					Text("Slow").onTapGesture {
						self.setStrategy(strategy: SlowDownStrategy())
					}
					.font(.system(size: 22).bold())
					.foregroundColor(.blue)
					
					Spacer()
					Button(action: {
						self.setStrategy(strategy: UTurnStrategy())
					}) {
						Text("reverse")
							.font(.system(size: 22).bold())
					}
					Spacer()
					Button(action: {
						self.setStrategy(strategy: SpeedUpStrategy())
					}) {
						Text("faster")
							.font(.system(size: 22).bold())
					}
					Spacer()
				}
				
				Text("execute").onTapGesture {
					if strategyAlgorithm != nil {
						self.execute()
					}
				}
				.font(.system(size: 22).bold())
				.foregroundColor(.blue)
				Spacer()
			}
			
		}
		
	}
	
}


struct HomeView_Previews: PreviewProvider {
    static var previews: some View {
		Group {
			HomeView()
		}
    }
}

