//
//  SimpleRemoteControl.swift
//  PoolC_CommandPattern_book
//
//  Created by 유태호 on 2022/04/07.
//

import Foundation

class SimpleRemoteControl {
	var slot: Command?
	
	func setCommand(command: Command) {
		slot = command
	}
	
	func buttonWasPressed() {
		slot?.execute()
	}
}
