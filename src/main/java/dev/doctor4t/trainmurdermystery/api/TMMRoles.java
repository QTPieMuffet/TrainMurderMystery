package dev.doctor4t.trainmurdermystery.api;

import dev.doctor4t.trainmurdermystery.TMM;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class TMMRoles {
    public static final ArrayList<Role> ROLES = new ArrayList<>();

    public static final Role CIVILIAN = registerRole(new Role(TMM.id("civilian"), 0x36E51B, true));
    public static final Role VIGILANTE = registerRole(new Role(TMM.id("vigilante"), 0x1B8AE5, true));
    public static final Role KILLER = registerRole(new Role(TMM.id("killer"), 0xC13838, false));
    public static final Role LOOSE_END = registerRole(new Role(TMM.id("loose_end"), 0x9F0000, false));

    public static Role registerRole(Role role) {
        ROLES.add(role);
        return role;
    }

    /**
     * @param identifier the mod id and name of the role
     * @param color      the role announcement color
     * @param isInnocent whether the gun drops when a person with this role is shot
     */
    public record Role(Identifier identifier, int color, boolean isInnocent) {
    }
}
