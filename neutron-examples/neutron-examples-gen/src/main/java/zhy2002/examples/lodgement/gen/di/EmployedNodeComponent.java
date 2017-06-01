package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

public interface EmployedNodeComponent {

    EmploymentStatusNode createEmploymentStatusNode();
    OccupationNode createOccupationNode();
    EmployerNameNode createEmployerNameNode();
    EmployerAddressNode createEmployerAddressNode();
    EmployerPhoneNode createEmployerPhoneNode();
    EmploymentStartedNode createEmploymentStartedNode();
    EmploymentEndedNode createEmploymentEndedNode();

}
