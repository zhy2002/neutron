package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MortgageClearingFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MortgageClearingFlagNode_MembersInjector
    implements MembersInjector<MortgageClearingFlagNode> {
  private final Provider<MortgageClearingFlagNodeComponent.Builder> builderProvider;

  public MortgageClearingFlagNode_MembersInjector(
      Provider<MortgageClearingFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MortgageClearingFlagNode> create(
      Provider<MortgageClearingFlagNodeComponent.Builder> builderProvider) {
    return new MortgageClearingFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(MortgageClearingFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MortgageClearingFlagNode instance,
      Provider<MortgageClearingFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
