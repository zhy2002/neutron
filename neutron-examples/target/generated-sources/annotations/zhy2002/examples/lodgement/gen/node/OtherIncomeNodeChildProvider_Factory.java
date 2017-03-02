package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherIncomeNodeChildProvider_Factory
    implements Factory<OtherIncomeNodeChildProvider> {
  private final MembersInjector<OtherIncomeNodeChildProvider>
      otherIncomeNodeChildProviderMembersInjector;

  public OtherIncomeNodeChildProvider_Factory(
      MembersInjector<OtherIncomeNodeChildProvider> otherIncomeNodeChildProviderMembersInjector) {
    assert otherIncomeNodeChildProviderMembersInjector != null;
    this.otherIncomeNodeChildProviderMembersInjector = otherIncomeNodeChildProviderMembersInjector;
  }

  @Override
  public OtherIncomeNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        otherIncomeNodeChildProviderMembersInjector, new OtherIncomeNodeChildProvider());
  }

  public static Factory<OtherIncomeNodeChildProvider> create(
      MembersInjector<OtherIncomeNodeChildProvider> otherIncomeNodeChildProviderMembersInjector) {
    return new OtherIncomeNodeChildProvider_Factory(otherIncomeNodeChildProviderMembersInjector);
  }
}
