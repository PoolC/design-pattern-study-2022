//
//  Light.swift
//  PoolC_CommandPattern_book
//
//  Created by 유태호 on 2022/04/07.
//

import Foundation

class Light {
	var location : String
	
	init(location: String) {
		self.location = location
	}
	
	func on() {
		print("\(location) light on")
	}
	func off() {
		print("\(location) light off")
	}
}

class LightOnCommand: Command {
	var light: Light
	
	init(light: Light) {
		self.light = light
	}
	
	func execute() {
		light.on()
	}
	
}

class LightOffCommand: Command {
	var light: Light
	
	init(light: Light) {
		self.light = light
	}
	
	func execute() {
		light.off()
	}
	
}
