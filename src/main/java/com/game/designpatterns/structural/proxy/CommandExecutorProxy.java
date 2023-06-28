package com.game.designpatterns.structural.proxy;

public class CommandExecutorProxy implements CommandExecutor{
    private boolean isAdmin;
    private CommandExecutor commandExecutor;
    CommandExecutorProxy(String username,String password){
        if(username.equals("bittu") && password.equals("manu")) isAdmin = true;
        commandExecutor = new CommandExecutorImpl();
    }
    @Override
    public void runCommand(String command) throws Exception {
        if(isAdmin){
            commandExecutor.runCommand(command);
        }else{
            if(command.trim().startsWith("rm")){
                throw new Exception("rm command is not allowed for non-admin users!");
            }else{
                commandExecutor.runCommand(command);
            }
        }
    }
}
