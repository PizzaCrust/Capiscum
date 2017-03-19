package capiscum.api.entity;

import capiscum.api.Server;
import capiscum.api.component.IdentifiableClassComponent;

/**
 * Represents a entity.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 * TODO Add more things...
 */
public interface Entity extends IdentifiableClassComponent<String> {

    Server getServer();

}
