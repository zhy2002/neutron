package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.DateOfBirthNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DateOfBirthNode_MembersInjector implements MembersInjector<DateOfBirthNode> {
  private final Provider<DateOfBirthNodeComponent.Builder> builderProvider;

  public DateOfBirthNode_MembersInjector(
      Provider<DateOfBirthNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<DateOfBirthNode> create(
      Provider<DateOfBirthNodeComponent.Builder> builderProvider) {
    return new DateOfBirthNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(DateOfBirthNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      DateOfBirthNode instance, Provider<DateOfBirthNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
