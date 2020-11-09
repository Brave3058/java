package until;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface ILogFactory {
    Logger log = LoggerFactory.getLogger(ILogFactory.class);
}
