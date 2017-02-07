package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@AccessNodeChildScope
@Subcomponent(modules = {AccessNodeChildModule.class})
public interface AccessNodeChildComponent {

    AccessContactTypeNode provideAccessContactTypeNode(@Named("accessContactTypeNode") AccessContactTypeNode impl);
    AccessContactTitleNode provideAccessContactTitleNode(@Named("accessContactTitleNode") AccessContactTitleNode impl);
    AccessContactFirstNameNode provideAccessContactFirstNameNode(@Named("accessContactFirstNameNode") AccessContactFirstNameNode impl);
    AccessContactLastNameNode provideAccessContactLastNameNode(@Named("accessContactLastNameNode") AccessContactLastNameNode impl);
    AccessCompanyNameNode provideAccessCompanyNameNode(@Named("accessCompanyNameNode") AccessCompanyNameNode impl);
    AccessTelephoneNode provideAccessTelephoneNode(@Named("accessTelephoneNode") AccessTelephoneNode impl);
    AccessOtherDescriptionNode provideAccessOtherDescriptionNode(@Named("accessOtherDescriptionNode") AccessOtherDescriptionNode impl);

}
