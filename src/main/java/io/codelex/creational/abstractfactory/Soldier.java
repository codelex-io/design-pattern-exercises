package io.codelex.creational.abstractfactory;

import static io.codelex.creational.abstractfactory.Side.ALLIED;
import static io.codelex.creational.abstractfactory.Side.SOVIET;

interface Soldier {
    Side side();

    class AlliedSoldier implements Soldier {
        @Override
        public Side side() {
            return ALLIED;
        }
    }

    class SovietSoldier implements Soldier {
        @Override
        public Side side() {
            return SOVIET;
        }
    }
}
