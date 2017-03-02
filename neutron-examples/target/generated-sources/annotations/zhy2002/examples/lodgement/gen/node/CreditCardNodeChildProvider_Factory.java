package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardNodeChildProvider_Factory
    implements Factory<CreditCardNodeChildProvider> {
  private final MembersInjector<CreditCardNodeChildProvider>
      creditCardNodeChildProviderMembersInjector;

  public CreditCardNodeChildProvider_Factory(
      MembersInjector<CreditCardNodeChildProvider> creditCardNodeChildProviderMembersInjector) {
    assert creditCardNodeChildProviderMembersInjector != null;
    this.creditCardNodeChildProviderMembersInjector = creditCardNodeChildProviderMembersInjector;
  }

  @Override
  public CreditCardNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        creditCardNodeChildProviderMembersInjector, new CreditCardNodeChildProvider());
  }

  public static Factory<CreditCardNodeChildProvider> create(
      MembersInjector<CreditCardNodeChildProvider> creditCardNodeChildProviderMembersInjector) {
    return new CreditCardNodeChildProvider_Factory(creditCardNodeChildProviderMembersInjector);
  }
}
