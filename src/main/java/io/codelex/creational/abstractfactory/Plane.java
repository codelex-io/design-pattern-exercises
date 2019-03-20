package io.codelex.creational.abstractfactory;

import static io.codelex.creational.abstractfactory.Side.ALLIED;
import static io.codelex.creational.abstractfactory.Side.SOVIET;

interface Plane {
    Side side();

    class AlliedPlane implements Plane {
        @Override
        public Side side() {
            return ALLIED;
        }
    }

    class SovietPlane implements Plane {
        @Override
        public Side side() {
            return SOVIET;
        }
    }
}
