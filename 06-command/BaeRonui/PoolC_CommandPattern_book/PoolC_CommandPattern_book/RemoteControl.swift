//
//  RemoteControl.swift
//  PoolC_CommandPattern_book
//
//  Created by 유태호 on 2022/04/08.
//

import Foundation

class RemoteControl {
	var onCommands: [Command?]
	var offCommands: [Command?]
	
	init() {
		onCommands = [Command?](repeating: nil, count: 7)
		offCommands = [Command?](repeating: nil, count: 7)
	}
	
	func setCommand(slot: Int, onCommand: Command, offCommand: Command) {
		onCommands[slot] = onCommand
		offCommands[slot] = offCommand;
	}
	
	func onButtonWasPushed(slot: Int) {
		onCommands[slot]?.execute()
	}
	
	func offButtonWasPushed(slot: Int) {
		offCommands[slot]?.execute()
	}
	
	func toString() -> String {
		var ret: String = ""
		
		ret.append("\n----- Remote Control ------\n")
		for i in 0..<onCommands.count {
			ret.append("[slot \(i)] \(String(describing: onCommands[i].self)) \(String(describing: offCommands[i].self))\n")
		}
		
		return ret
	}
}
