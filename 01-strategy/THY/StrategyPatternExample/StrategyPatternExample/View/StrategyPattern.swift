//
//  StrategyPattern.swift
//  StrategyPatternExample
//
//  Created by 유태호 on 2022/03/10.
//

import Foundation

protocol VelocityStrategy {
	func apply(
		foregroundVelocityCoefficient fCoeff: inout Double,
		backgroundVelocityCoefficient bCoeff: inout Double
	)
}

class SpeedUpStrategy: VelocityStrategy {
	func apply(
		foregroundVelocityCoefficient fCoeff: inout Double,
		backgroundVelocityCoefficient bCoeff: inout Double
	) {
		fCoeff = fCoeff * 2
		bCoeff = bCoeff * 2
	}
}

class SlowDownStrategy: VelocityStrategy {
	func apply(
		foregroundVelocityCoefficient fCoeff: inout Double,
		backgroundVelocityCoefficient bCoeff: inout Double
	) {
		fCoeff = fCoeff / 2
		bCoeff = bCoeff / 2
	}
}

class UTurnStrategy: VelocityStrategy {
	func apply(
		foregroundVelocityCoefficient fCoeff: inout Double,
		backgroundVelocityCoefficient bCoeff: inout Double
	) {
		fCoeff = fCoeff * -1
		bCoeff = bCoeff * -1
	}
}
