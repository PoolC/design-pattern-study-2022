//
//  WaveForm.swift
//  StrategyPatternExample
//
//  Created by 유태호 on 2022/03/10.
//

import SwiftUI

struct WaveForm: View {
	var color: Color
	var amplify: CGFloat
	@Binding var accRate: Double
	
	var body: some View {
		TimelineView(.animation) { timeLine in
			Canvas { context, size in
				let timeNow = timeLine.date.timeIntervalSinceReferenceDate * accRate
				let angle = timeNow.remainder(dividingBy: 2)
				let offset = angle * size.width
				
				
				context.translateBy(x: offset, y: 0)
				context.fill(getPath(size: size), with: .color(color))
				context.translateBy(x: -size.width, y: 0)
				context.fill(getPath(size: size), with: .color(color))
				context.translateBy(x: size.width * 2, y: 0)
				context.fill(getPath(size: size), with: .color(color))
			}
			.ignoresSafeArea(.all)
		}
	}
	
	func getPath(size : CGSize) -> Path {
		return Path { path in
			
			let midHeight = size.height / 2
			let width = size.width
			
			path.move(to:CGPoint(x : 0, y : midHeight))
			
			path.addCurve(to: CGPoint(x: width, y: midHeight), control1: CGPoint(x : width * 0.5, y: midHeight + amplify), control2: CGPoint(x : width * 0.5, y: midHeight - amplify))
			
			path.addLine(to: CGPoint(x: width, y: size.height))
			path.addLine(to: CGPoint(x: 0, y: size.height))
			
		}
	}
}

//
//struct WaveForm_Previews: PreviewProvider {
//	@Binding var tmp: Double = projectedValue(Double: 30)
//
//    static var previews: some View {
//		WaveForm(color: .purple, amplify: 150, accRate: $tmp)
//    }
//}
