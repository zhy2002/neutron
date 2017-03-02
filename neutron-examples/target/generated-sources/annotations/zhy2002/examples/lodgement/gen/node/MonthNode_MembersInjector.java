package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.MonthNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MonthNode_MembersInjector implements MembersInjector<MonthNode> {
  private final Provider<MonthNodeComponent.Builder> builderProvider;

  public MonthNode_MembersInjector(Provider<MonthNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<MonthNode> create(
      Provider<MonthNodeComponent.Builder> builderProvider) {
    return new MonthNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(MonthNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      MonthNode instance, Provider<MonthNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
