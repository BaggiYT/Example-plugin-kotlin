package me.baggi

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

object ExampleListener : Listener {
    //Event
    @EventHandler
    fun onJoin(event: PlayerJoinEvent){
        event.player.sendMessage("Example message")
    }

    @EventHandler
    fun PlayerJoinEvent.handle(){
        it.sendMessage("Example message")
    }
}
