package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.LoanClearingFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanClearingFlagNode_MembersInjector
    implements MembersInjector<LoanClearingFlagNode> {
  private final Provider<LoanClearingFlagNodeComponent.Builder> builderProvider;

  public LoanClearingFlagNode_MembersInjector(
      Provider<LoanClearingFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<LoanClearingFlagNode> create(
      Provider<LoanClearingFlagNodeComponent.Builder> builderProvider) {
    return new LoanClearingFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(LoanClearingFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      LoanClearingFlagNode instance,
      Provider<LoanClearingFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
