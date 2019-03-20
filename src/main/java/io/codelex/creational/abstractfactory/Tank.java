package io.codelex.creational.abstractfactory;

import static io.codelex.creational.abstractfactory.Side.ALLIED;
import static io.codelex.creational.abstractfactory.Side.SOVIET;

interface Tank {
    Side side();

    class AlliedTank implements Tank {
        @Override
        public Side side() {
            return ALLIED;
        }
    }

    class SovietTank implements Tank {
        @Override
        public Side side() {
            return SOVIET;
        }
    }
}
