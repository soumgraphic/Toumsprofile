package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new dev.soumgraphic.com.toumsprofile.DataBinderMapperImpl());
  }
}
