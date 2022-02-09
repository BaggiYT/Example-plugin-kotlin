package me.baggi

import org.bukkit.Bukkit
import org.bukkit.command.CommandExecutor
import org.bukkit.entity.Player
import org.bukkit.plugin.java.JavaPlugin

lateinit var app: App

class App : JavaPlugin() {

    override fun onEnable() {
        //Instance
        app = this

        //Register events
        Bukkit.getPluginManager().registerEvents(ExampleListener, this)

        //Register commands
        getCommand("exampleCommand").setExecutor(CommandExecutor { sender, _, args, _ ->
            if (sender is Player)
                sender.sendMessage("Example message! " + args[0])
            return@CommandExecutor true
        })

    }
}