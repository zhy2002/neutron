package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;

public abstract class PhoneInfoFieldNode extends StringUiNode<PhoneInfoNode>
{
    protected PhoneInfoFieldNode(PhoneInfoNode parent, String name) {
        super(parent, name);
    }


}
