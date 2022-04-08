import Foundation

let receiver = TextEditor()

let invoker = Invoker()

let writeCommand = WriteCommand(receiver: receiver, backup: "ABC")

// write ABC
invoker.executeCommand(command: writeCommand)
print(receiver.text)

// copy all and paste
invoker.executeCommand(command: CopyCommand(receiver: receiver))
invoker.executeCommand(command: PasteCommand(receiver: receiver))
print(receiver.text)

// write ZZZ
invoker.executeCommand(command: WriteCommand(receiver: receiver, backup: "ZZZ"))
print(receiver.text)


// paste
invoker.executeCommand(command: PasteCommand(receiver: receiver))
print(receiver.text)

// undo paste
invoker.undoCommand()
print(receiver.text)


// undo write ZZZ
invoker.undoCommand()
print(receiver.text)
