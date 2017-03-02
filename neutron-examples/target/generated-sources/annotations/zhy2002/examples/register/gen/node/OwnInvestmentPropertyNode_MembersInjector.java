package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.di.OwnInvestmentPropertyNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnInvestmentPropertyNode_MembersInjector
    implements MembersInjector<OwnInvestmentPropertyNode> {
  private final Provider<OwnInvestmentPropertyNodeComponent.Builder> builderProvider;

  public OwnInvestmentPropertyNode_MembersInjector(
      Provider<OwnInvestmentPropertyNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<OwnInvestmentPropertyNode> create(
      Provider<OwnInvestmentPropertyNodeComponent.Builder> builderProvider) {
    return new OwnInvestmentPropertyNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(OwnInvestmentPropertyNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      OwnInvestmentPropertyNode instance,
      Provider<OwnInvestmentPropertyNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
