//
//  StereoOnWithCDCommand.swift
//  PoolC_CommandPattern_book
//
//  Created by 유태호 on 2022/04/08.
//

import Foundation

class Stereo {
	var location : String
	
	init(location: String) {
		self.location = location
	}
	
	func on() {
		print("\(location) stereo on")
	}
	
	func off() {
		print("\(location) stereo off")
	}
	
	func setDvd() {
		print("\(location) stereo setDvd")
	}
	
	func setCD() {
		print("\(location) stereo setCD")
	}
	
	func setVolume(_ i : Int) {
		print("\(location) stereo setVolume \(i)")
	}
}


class StereoOnWithCDCommand: Command {
	var stereo: Stereo;
	
	init(stereo: Stereo) {
		self.stereo = stereo
	}
	
	func execute() {
		stereo.on()
		stereo.setCD()
		stereo.setVolume(11)
	}
	
	func undo() {
		stereo.off()
	}
}

class StereoOffWithCDCommand: Command {
	var stereo: Stereo;
	
	init(stereo: Stereo) {
		self.stereo = stereo
	}
	
	func execute() {
		stereo.off()
	}
	
	func undo() {
		stereo.on()
		stereo.setCD()
		stereo.setVolume(11)
	}
}
