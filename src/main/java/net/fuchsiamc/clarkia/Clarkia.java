package net.fuchsiamc.clarkia;

import com.google.inject.Inject;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import net.kyori.adventure.text.*;
import net.kyori.adventure.text.format.Style;
import net.kyori.adventure.title.Title;
import net.kyori.adventure.title.TitlePart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnknownNullability;
import org.jetbrains.annotations.Unmodifiable;
import org.slf4j.Logger;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

@Plugin(
        id = "clarkia",
        name = "Clarkia",
        version = "1.0.0",
        description = "Velocity plugin handling sending players to lobbies."
)
public class Clarkia {

    @Inject private ProxyServer server;
    @Inject private Logger logger;

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        /*
        server.getScheduler()
                .buildTask(this, () -> {
                    server.showTitle(Title.title(Component.text(""), Component.text("")));
                    server.shutdown();
                })
                .repeat(1L, TimeUnit.DAYS)
                .schedule();
         */
    }
}
