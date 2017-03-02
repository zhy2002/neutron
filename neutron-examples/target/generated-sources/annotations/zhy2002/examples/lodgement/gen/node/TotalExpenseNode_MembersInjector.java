package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.TotalExpenseNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TotalExpenseNode_MembersInjector implements MembersInjector<TotalExpenseNode> {
  private final Provider<TotalExpenseNodeComponent.Builder> builderProvider;

  public TotalExpenseNode_MembersInjector(
      Provider<TotalExpenseNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<TotalExpenseNode> create(
      Provider<TotalExpenseNodeComponent.Builder> builderProvider) {
    return new TotalExpenseNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(TotalExpenseNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      TotalExpenseNode instance, Provider<TotalExpenseNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
