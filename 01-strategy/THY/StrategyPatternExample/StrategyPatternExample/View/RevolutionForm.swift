//
//  RevolutionForm.swift
//  StrategyPatternExample
//
//  Created by 유태호 on 2022/03/11.
//

import SwiftUI

struct RevolutionForm: View {
	@State var accRate1 = 1.0
	@State var accRate2 = 2.0
	let speedUP = SpeedUpStrategy()
	let slowDown = SlowDownStrategy()
	let uTurn = UTurnStrategy()
	
	var body: some View {
		ZStack {
			Color(.white)
				.ignoresSafeArea(.all)
			WaveForm(color: .blue.opacity(0.6), amplify : 150, accRate: $accRate1)
			WaveForm(color: .blue.opacity(0.8), amplify : 100, accRate: $accRate2)
			VStack {
				HStack {
					Spacer()
					
					Text("Slow").onTapGesture {
						slowDown.apply(foregroundVelocityCoefficient: &accRate1, backgroundVelocityCoefficient: &accRate2)
					}
					.font(.system(size: 22).bold())
					.foregroundColor(.blue)
					
					
					Spacer()
					Button(action: {
						uTurn.apply(foregroundVelocityCoefficient: &accRate1, backgroundVelocityCoefficient: &accRate2)
					}) {
						Text("reverse")
							.font(.system(size: 22).bold())
					}
					Spacer()
					Button(action: {
						speedUP.apply(foregroundVelocityCoefficient: &accRate1, backgroundVelocityCoefficient: &accRate2)
					}) {
						Text("faster")
							.font(.system(size: 22).bold())
					}
					Spacer()
				}
				Spacer()
			}
			
		}
		
	}
}

struct RevolutionForm_Previews: PreviewProvider {
    static var previews: some View {
        RevolutionForm()
    }
}
