//
//  GarageDoor.swift
//  PoolC_CommandPattern_book
//
//  Created by 유태호 on 2022/04/08.
//

import Foundation

class GarageDoor {
	var location : String
	
	init(location: String) {
		self.location = location
	}
	
	func up() {
		print("\(location) garageDoor up")
	}
	func down() {
		print("\(location) garageDoor down")
	}
}

class GarageDoorUpCommand: Command {
	var garageDoor: GarageDoor
	
	init(garageDoor: GarageDoor) {
		self.garageDoor = garageDoor
	}
	
	func execute() {
		garageDoor.up()
	}
	
	func undo() {
		garageDoor.down()
	}
	
}

class GarageDoorDownCommand: Command {
	var garageDoor: GarageDoor
	
	init(garageDoor: GarageDoor) {
		self.garageDoor = garageDoor
	}
	
	func execute() {
		garageDoor.down()
	}
	
	func undo() {
		garageDoor.up()
	}
	
}
