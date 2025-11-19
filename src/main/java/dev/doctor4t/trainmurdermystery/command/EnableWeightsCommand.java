package dev.doctor4t.trainmurdermystery.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import dev.doctor4t.trainmurdermystery.cca.GameWorldComponent;
import dev.doctor4t.trainmurdermystery.cca.ScoreboardRoleSelectorComponent;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import org.jetbrains.annotations.NotNull;

public class EnableWeightsCommand {
    public static void register(@NotNull CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(
                CommandManager.literal("tmm:enableWeights")
                        .requires(source -> source.hasPermissionLevel(2))
                        .then(CommandManager.argument("enabled", BoolArgumentType.bool())
                                .executes(context -> {
                                    GameWorldComponent.KEY.get(context.getSource().getWorld()).setWeightsEnabled(BoolArgumentType.getBool(context, "enabled"));
                                    ScoreboardRoleSelectorComponent.KEY.get(context.getSource()).reset();
                                    return 1;
                                }))
        );
    }
}
