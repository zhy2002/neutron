package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.PersonApplicantTypeNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonApplicantTypeNode_MembersInjector
    implements MembersInjector<PersonApplicantTypeNode> {
  private final Provider<PersonApplicantTypeNodeComponent.Builder> builderProvider;

  public PersonApplicantTypeNode_MembersInjector(
      Provider<PersonApplicantTypeNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<PersonApplicantTypeNode> create(
      Provider<PersonApplicantTypeNodeComponent.Builder> builderProvider) {
    return new PersonApplicantTypeNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(PersonApplicantTypeNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      PersonApplicantTypeNode instance,
      Provider<PersonApplicantTypeNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
