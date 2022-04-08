import Foundation

class PasteCommand: Command {
    var receiver: TextEditor
    var backup: String
    
    init(receiver: TextEditor) {
        self.receiver = receiver
        self.backup = self.receiver.clipboard
    }
    
    func undo() {
        let startIndex = receiver.text.startIndex
        let lastIndex = receiver.text.index(startIndex, offsetBy: receiver.text.count - backup.count)
        receiver.text = String(receiver.text[startIndex..<lastIndex])
    }
    
    func execute() {
        self.receiver.text += backup
    }
}
