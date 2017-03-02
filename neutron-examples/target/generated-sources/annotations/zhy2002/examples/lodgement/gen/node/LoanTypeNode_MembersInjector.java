package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.LoanTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanTypeNode_MembersInjector implements MembersInjector<LoanTypeNode> {
  private final Provider<LoanTypeNodeComponent.Builder> builderProvider;

  public LoanTypeNode_MembersInjector(Provider<LoanTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<LoanTypeNode> create(
      Provider<LoanTypeNodeComponent.Builder> builderProvider) {
    return new LoanTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(LoanTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      LoanTypeNode instance, Provider<LoanTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
