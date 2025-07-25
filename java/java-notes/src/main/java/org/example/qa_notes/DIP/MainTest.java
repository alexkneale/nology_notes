package org.example.qa_notes.DIP;

import org.example.qa_notes.SOLID.ISP.Good.IClothes;

public class MainTest {
    // Dependency Inversion
    // Two rules
    // 1. High level modules should not depend on low level modules. Both should depend on abstractions.
    // 2. Abstractions should not depend on details, details should depend on abstractions.

    // This principle is primarily concerned with reducing dependencies among the code modules.
    // We can think of it as needing the low level objects to define contracts that the high level objects can use
    // without the high level objects, needing to care about the specific implementation the low level objects provide.


    public static void main(String[] args) {

    }
}

class HoldLogFile {
    public void LogContext() {

    }
}

class HoldDBLogs {
    public void LogContext() {

    }
}

// we use above classes in a new class
// if we change one of original class, may cause dependency issues

class ManageLogs{
    private HoldLogFile _HoldLogFile;
    private HoldDBLogs _HoldDBLogs;

    public ManageLogs() {
        _HoldLogFile = new HoldLogFile();
        _HoldDBLogs = new HoldDBLogs();
    }

    public void LogContext() {
        _HoldDBLogs.LogContext();
        _HoldLogFile.LogContext();
    }

}

// solve problem with interface

interface ILogger{
    public void LogContext();

}
class HoldLogFile2 implements ILogger {
    @Override
    public void LogContext() {
    }
}

class HoldDBLogs2 implements ILogger {
    @Override
    public void LogContext() {
    }
}

class ManageLogs2 {
    private ILogger _Ilogger;

    public ManageLogs2(ILogger logger) {
        _Ilogger = logger;
    }

    public void LogContext() {
        _Ilogger.LogContext();
    }

}