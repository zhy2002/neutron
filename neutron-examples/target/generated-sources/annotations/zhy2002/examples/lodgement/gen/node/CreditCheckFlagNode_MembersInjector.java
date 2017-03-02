package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.CreditCheckFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CreditCheckFlagNode_MembersInjector
    implements MembersInjector<CreditCheckFlagNode> {
  private final Provider<CreditCheckFlagNodeComponent.Builder> builderProvider;

  public CreditCheckFlagNode_MembersInjector(
      Provider<CreditCheckFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<CreditCheckFlagNode> create(
      Provider<CreditCheckFlagNodeComponent.Builder> builderProvider) {
    return new CreditCheckFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(CreditCheckFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      CreditCheckFlagNode instance,
      Provider<CreditCheckFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
