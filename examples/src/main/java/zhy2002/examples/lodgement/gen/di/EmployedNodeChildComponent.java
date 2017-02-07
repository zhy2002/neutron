package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@EmployedNodeChildScope
@Subcomponent(modules = {EmployedNodeChildModule.class})
public interface EmployedNodeChildComponent {

    EmploymentStatusNode provideEmploymentStatusNode(@Named("employmentStatusNode") EmploymentStatusNode impl);
    OccupationNode provideOccupationNode(@Named("occupationNode") OccupationNode impl);
    EmployerNameNode provideEmployerNameNode(@Named("employerNameNode") EmployerNameNode impl);
    EmployerAddressNode provideEmployerAddressNode(@Named("employerAddressNode") EmployerAddressNode impl);
    EmployerPhoneNode provideEmployerPhoneNode(@Named("employerPhoneNode") EmployerPhoneNode impl);
    EmploymentStartedNode provideEmploymentStartedNode(@Named("employmentStartedNode") EmploymentStartedNode impl);
    EmploymentEndedNode provideEmploymentEndedNode(@Named("employmentEndedNode") EmploymentEndedNode impl);

}
