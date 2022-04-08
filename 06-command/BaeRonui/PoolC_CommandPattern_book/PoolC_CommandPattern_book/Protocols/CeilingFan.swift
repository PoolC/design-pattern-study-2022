//
//  CeilingFan.swift
//  PoolC_CommandPattern_book
//
//  Created by 유태호 on 2022/04/08.
//

import Foundation

class CeilingFan {
	var location : String
	
	init(location: String) {
		self.location = location
	}
	
	func on() {
		print("\(location) ceilingFan on")
	}
	func off() {
		print("\(location) ceilingFan off")
	}
}

class CeilingFanOnCommand: Command {
	var ceilingFan: CeilingFan
	
	init(ceilingFan: CeilingFan) {
		self.ceilingFan = ceilingFan
	}
	
	func execute() {
		ceilingFan.on()
	}
	
}

class CeilingFanOffCommand: Command {
	var ceilingFan: CeilingFan
	
	init(ceilingFan: CeilingFan) {
		self.ceilingFan = ceilingFan
	}
	
	func execute() {
		ceilingFan.off()
	}
	
}
