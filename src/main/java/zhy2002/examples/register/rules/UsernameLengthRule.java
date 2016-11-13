package zhy2002.examples.register.rules;

import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.rules.UiNodeRule;

/**
 * Created by ZHY on 13/11/2016.
 */
public class UsernameLengthRule extends UiNodeRule<UsernameNode> {

    public static final String ERROR_MESSAGE = "";

    protected UsernameLengthRule(UsernameNode host) {
        super(host, DefaultPhases.Validate);
    }
}
