import Foundation

// Command
protocol Command {
    var receiver: TextEditor { get set }
    var backup: String { get set }
    
    func execute()
    func undo()
}
