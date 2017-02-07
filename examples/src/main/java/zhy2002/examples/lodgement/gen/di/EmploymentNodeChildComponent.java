package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@EmploymentNodeChildScope
@Subcomponent(modules = {EmploymentNodeChildModule.class})
public interface EmploymentNodeChildComponent {

    EmploymentTypeNode provideEmploymentTypeNode(@Named("employmentTypeNode") EmploymentTypeNode impl);
    PayeEmployedNode providePayeEmployedNode(@Named("payeEmployedNode") PayeEmployedNode impl);
    SelfEmployedNode provideSelfEmployedNode(@Named("selfEmployedNode") SelfEmployedNode impl);
    UnemployedNode provideUnemployedNode(@Named("unemployedNode") UnemployedNode impl);
    RetiredEmploymentNode provideRetiredEmploymentNode(@Named("retiredEmploymentNode") RetiredEmploymentNode impl);

}
