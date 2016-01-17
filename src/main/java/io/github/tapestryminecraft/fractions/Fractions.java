package io.github.tapestryminecraft.fractions;

import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = "fractions", name = "Fractions", version = "0")
public class Fractions {
	
	@Listener
	public void onServerStart(GameStartedServerEvent event) {
		System.out.println("Fractions starting...");
	}
	
	// TODO HTTP Server
	// listen for requests from the Rails server
	// does this need another thread?
	
	// TODO Database Connection
	// query database for land authorizations
	
	// TODO Cache
	// store data fetched from database
	
	// TODO Listeners
	// land authorizations
	// culture generation
	// chunk ownership information
	
	// TODO Commands
	// account activation
	// password reset
}
