package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ExistingMortgageListNodeItemProvider_Factory
    implements Factory<ExistingMortgageListNodeItemProvider> {
  private final MembersInjector<ExistingMortgageListNodeItemProvider>
      existingMortgageListNodeItemProviderMembersInjector;

  public ExistingMortgageListNodeItemProvider_Factory(
      MembersInjector<ExistingMortgageListNodeItemProvider>
          existingMortgageListNodeItemProviderMembersInjector) {
    assert existingMortgageListNodeItemProviderMembersInjector != null;
    this.existingMortgageListNodeItemProviderMembersInjector =
        existingMortgageListNodeItemProviderMembersInjector;
  }

  @Override
  public ExistingMortgageListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        existingMortgageListNodeItemProviderMembersInjector,
        new ExistingMortgageListNodeItemProvider());
  }

  public static Factory<ExistingMortgageListNodeItemProvider> create(
      MembersInjector<ExistingMortgageListNodeItemProvider>
          existingMortgageListNodeItemProviderMembersInjector) {
    return new ExistingMortgageListNodeItemProvider_Factory(
        existingMortgageListNodeItemProviderMembersInjector);
  }
}
