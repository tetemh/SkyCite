package fr.skyserver.coreplugin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockbukkit.mockbukkit.MockBukkit;
import org.mockbukkit.mockbukkit.ServerMock;
import org.mockbukkit.mockbukkit.entity.PlayerMock;

import static org.junit.jupiter.api.Assumptions.*;

public class CorePluginTest {

    private CorePlugin corePlugin;
    private ServerMock server;

    @BeforeEach
    public void setUp() {
        server = MockBukkit.mock();
        corePlugin = MockBukkit.load(CorePlugin.class);
    }



    @Test
    void playerJoinsServer() {
        PlayerMock player = server.addPlayer();

        assumeFalse(corePlugin.getCPlayerManager().getEntities().isEmpty());

    }

    @AfterEach
    public void tearDown()
    {
        MockBukkit.unmock();
    }


}