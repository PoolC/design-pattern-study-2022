import java.io.*;
import java.util.*;

public class Main
{
    static ArrayList<IObserver> observersList = new ArrayList<IObserver>();
    static ArrayList<ISubject> subjectsList = new ArrayList<ISubject>();

    static Scanner sc;
    static BufferedWriter wr;
    static StringTokenizer stk;

    static String HelloStr = 
    """
        Hi buddy.
        Here is an instruction of this 'Observer Pattern Demo'
        You can do some things like making new observer or subject or registering an observer into subject.

        Now we use WeatherDevice as subject not like WeatherData in textbook 'HeadFirst~~'.
        And we use WeatherDisplay as Observer which is same in textbook 'HeadFirst~~'.

        Type 'help' to check commands.
            """;

    static String HelpStr =
    """
            help : print this message which help you to use this demo.
            clear : clear the console.
            info : print all infos
            list [('observer')('subject')] : print list of observer or subject
            new [('observer')('subject')] (Name)? : make instance of observer or subject with (Name).
                -- you can skip Name then it has 'NoName' as Name.
            register (SubjectName) (ObserverName) : register Observer with name (ObserverName) to Subject with name (SubjectName).
            unregister (SubjectName) (ObserverName) : unregister Observer with name (ObserverName) to Subject with name (SubjectName).
            set (SubjectName) (temperature : float) (humidity : float) (pressure : float) : set WeatherData in Subject with Name (SubjectName).
            """;

    static String WrongStr =
    """
            You typed wrong command check commands as type 'help'.
            """;
    
    
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        wr = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println(HelloStr);

        String input;
        try{
        do{
            input = sc.nextLine();
            stk = new StringTokenizer(input);
            if (!stk.hasMoreTokens()){
                break;
            }

            switch (stk.nextToken()){
                case "new" :
                if (stk.hasMoreTokens()){
                    Object obj;
                    switch (stk.nextToken()){
                        case "observer" : 
                        obj = new WeatherDisplay();
                        observersList.add((WeatherDisplay)obj);
                        if (stk.hasMoreTokens()){
                            ((WeatherDisplay)obj).DisplayName = stk.nextToken();
                            wr.write(((WeatherDisplay)obj).DisplayName + " display added\n");
                        }
                        break;
                        case "subject" : 
                        obj = new WeatherDevice();
                        subjectsList.add((WeatherDevice)obj);
                        if (stk.hasMoreTokens()){
                            ((WeatherDevice)obj).DeviceName = stk.nextToken();
                            wr.write(((WeatherDevice)obj).DeviceName + " device added\n");
                        } 
                        break;
                    }
                }
                break;
                case "set" :
                if (stk.countTokens() <= 3) break;
                WeatherDevice sub = (WeatherDevice)FindSubject(stk.nextToken());

                WeatherData data = new WeatherData(Float.parseFloat(stk.nextToken()), 
                        Float.parseFloat(stk.nextToken()), Float.parseFloat(stk.nextToken()));

                sub.setData(data);
                break;
                case "register" :
                if (stk.countTokens() <= 1) break;
                    WeatherDevice device = (WeatherDevice)FindSubject(stk.nextToken());
                    WeatherDisplay display = (WeatherDisplay)FindObserver(stk.nextToken());
                    device.Register(display);
                    wr.write("Registered " + display.DisplayName + " to " + device.DeviceName + "\n");
                break;
                case "unregister" :
                if (stk.countTokens() <= 1) break;
                    device = (WeatherDevice)FindSubject(stk.nextToken());
                    display = (WeatherDisplay)FindObserver(stk.nextToken());
                    device.UnRegister(display);
                    wr.write("UnRegistered " + display.DisplayName + " from " + device.DeviceName + "\n");
                break;
                case "list" :
                    if (stk.hasMoreTokens()){
                        switch (stk.nextToken()){
                            case "observer" : ObserversList();
                            break;
                            case "subject" : SubjectsList();
                            break;
                        }
                    }
                break;
                case "info" : Info();
                break;
                case "help" :
                    wr.write(HelpStr);
                break;
                case "clear" :
                    System.out.print("\033[H\033[2J");
                break;
                default : 
                    wr.write(WrongStr);
                break;
            }
            wr.flush();
        }
        while (!input.contains("exit"));
        
        sc.close();
        wr.close();
        } catch (IOException e) {}
    }

    static IObserver FindObserver(String name){
        for (int i = 0; i < observersList.size(); i++){
            if (observersList.get(i) instanceof WeatherDisplay WD){
                if (WD.DisplayName.equals(name)){
                    return observersList.get(i);
                }
            }
        } 
        return null;
    }
    
    static ISubject FindSubject(String name){
        for (int i = 0; i < subjectsList.size(); i++){
            if (subjectsList.get(i) instanceof WeatherDevice WD){
                if (WD.DeviceName.equals(name)){
                    return subjectsList.get(i);
                }
            }
        } 
        return null;
    }

    static void ObserversList(){
        String title = String.format("%nObserver number : %d.%n", observersList.size());
        try{
            wr.write(title);
            for (IObserver observer : observersList){
                if (observer instanceof WeatherDisplay WD){
                    wr.write("Name : " + WD.DisplayName + "\n");
                }
            }
        } catch (IOException e) {}
    }
    
    static void SubjectsList(){
        String title = String.format("%nSubject number : %d.%n", subjectsList.size());
        try{
            wr.write(title);
            for (ISubject subject : subjectsList){
                if (subject instanceof WeatherDevice WD){
                    wr.write("Name : " + WD.DeviceName + "\n");
                    WD.Info(wr);
                }
            }
        } catch (IOException e) {}
    }

    static void Info(){
        try {
            wr.write("\nFull Info of Subjects and Observers\n");
        } catch (IOException e) {}
        SubjectsList();
        ObserversList();
    }
}