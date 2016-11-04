package zhy2002.neutron.anz.loanapplication.brokerdetails;


import org.junit.Before;
import org.junit.Test;
import zhy2002.neutron.anz.loanapplication.LoanApplicationNode;
import zhy2002.neutron.anz.loanapplication.LoanApplicationNodeFactory;
import zhy2002.neutron.uinode.RootUiNode;
import zhy2002.neutron.uinode.UiNodeContext;
import zhy2002.neutron.uinode.UiNodeCreator;
import zhy2002.neutron.uinode.factoryregistry.MutableUiNodeFactoryRegistry;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

/**
 * Test broker details.
 */
public class BrokerDetailsNodeFactoryTest {

    private UiNodeCreator creator;
    private RootUiNode rootUiNode;
    private LoanApplicationNode loanApplicationNode;
    private BrokerDetailsNode brokerDetailsNode;


    @Before
    public void setup() {
        creator = new UiNodeCreator();
        MutableUiNodeFactoryRegistry registry = new MutableUiNodeFactoryRegistry();
        registry.register(LoanApplicationNode.class, new LoanApplicationNodeFactory());
        registry.register(BrokerDetailsNode.class, new BrokerDetailsNodeFactory());
        UiNodeContext context = new UiNodeContext(registry);
        rootUiNode = new RootUiNode(context);
        loanApplicationNode = creator.create(LoanApplicationNode.class, rootUiNode);
        brokerDetailsNode = creator.create(BrokerDetailsNode.class, loanApplicationNode);
    }

    @Test
    public void test1() {

        assertThat(brokerDetailsNode, notNullValue());
    }


}