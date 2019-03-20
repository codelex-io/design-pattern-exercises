package io.codelex.creational.factorymethod;

import static io.codelex.creational.factorymethod.Side.ALLIED;
import static io.codelex.creational.factorymethod.Side.SOVIET;

interface Weapon {
    enum Type {
        GUN, LASER
    }

    Side side();

    Type type();

    class AlliedWeapon implements Weapon {
        private final Type type;

        public AlliedWeapon(Type type) {
            this.type = type;
        }

        @Override
        public Side side() {
            return ALLIED;
        }

        @Override
        public Type type() {
            return type;
        }
    }

    class SovietWeapon implements Weapon {
        private final Type type;

        public SovietWeapon(Type type) {
            this.type = type;
        }

        @Override
        public Side side() {
            return SOVIET;
        }

        @Override
        public Type type() {
            return type;
        }
    }
}
