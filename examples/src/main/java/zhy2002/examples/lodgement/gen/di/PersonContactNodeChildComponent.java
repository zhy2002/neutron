package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@PersonContactNodeChildScope
@Subcomponent(modules = {PersonContactNodeChildModule.class})
public interface PersonContactNodeChildComponent {

    ContactTelephoneNode provideHomePhoneNode(@Named("homePhoneNode") ContactTelephoneNode impl);
    ContactTelephoneNode provideWorkPhoneNode(@Named("workPhoneNode") ContactTelephoneNode impl);
    ContactTelephoneNode provideFaxNumberNode(@Named("faxNumberNode") ContactTelephoneNode impl);
    MobileNumberNode provideMobileNumberNode(@Named("mobileNumberNode") MobileNumberNode impl);
    ContactEmailNode provideContactEmailNode(@Named("contactEmailNode") ContactEmailNode impl);
    ContactAddressNode provideCurrentAddressNode(@Named("currentAddressNode") ContactAddressNode impl);
    MovedToCurrentAddressNode provideMovedToCurrentAddressNode(@Named("movedToCurrentAddressNode") MovedToCurrentAddressNode impl);
    ContactAddressNode providePostalAddressNode(@Named("postalAddressNode") ContactAddressNode impl);
    ContactAddressNode providePreviousAddressNode(@Named("previousAddressNode") ContactAddressNode impl);
    MovedToPreviousAddressNode provideMovedToPreviousAddressNode(@Named("movedToPreviousAddressNode") MovedToPreviousAddressNode impl);
    MovedFromPreviousAddressNode provideMovedFromPreviousAddressNode(@Named("movedFromPreviousAddressNode") MovedFromPreviousAddressNode impl);

    @Subcomponent.Builder
    interface Builder {

        Builder setPersonContactNodeChildModule(PersonContactNodeChildModule module);

        PersonContactNodeChildComponent build();
    }
}
