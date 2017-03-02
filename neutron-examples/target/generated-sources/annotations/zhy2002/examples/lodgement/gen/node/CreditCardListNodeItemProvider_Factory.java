package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCardListNodeItemProvider_Factory
    implements Factory<CreditCardListNodeItemProvider> {
  private final MembersInjector<CreditCardListNodeItemProvider>
      creditCardListNodeItemProviderMembersInjector;

  public CreditCardListNodeItemProvider_Factory(
      MembersInjector<CreditCardListNodeItemProvider>
          creditCardListNodeItemProviderMembersInjector) {
    assert creditCardListNodeItemProviderMembersInjector != null;
    this.creditCardListNodeItemProviderMembersInjector =
        creditCardListNodeItemProviderMembersInjector;
  }

  @Override
  public CreditCardListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        creditCardListNodeItemProviderMembersInjector, new CreditCardListNodeItemProvider());
  }

  public static Factory<CreditCardListNodeItemProvider> create(
      MembersInjector<CreditCardListNodeItemProvider>
          creditCardListNodeItemProviderMembersInjector) {
    return new CreditCardListNodeItemProvider_Factory(
        creditCardListNodeItemProviderMembersInjector);
  }
}
