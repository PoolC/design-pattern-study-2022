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
	var undoCommand: Command?
	
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
		undoCommand = onCommands[slot];
	}
	
	func offButtonWasPushed(slot: Int) {
		offCommands[slot]?.execute()
		undoCommand = onCommands[slot];
	}
	
	func undoButtonWasPushed() {
		undoCommand?.undo()
	}
	
	func toString() -> String {
		var ret: String = ""
		ret.append("\n----- Remote Control ------\n")
		for i in 0..<onCommands.count {
			if let on = onCommands[i].self, let off = offCommands[i].self {
				ret.append("[slot \(i)] \(on) \(off) \n")
			} else {
				ret.append("[slot \(i)] nil nil\n")
			}
		}
		return ret
	}
	
}
