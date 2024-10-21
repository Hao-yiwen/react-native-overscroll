import { useCallback, useState } from 'react';
import { StyleSheet, View, Text, FlatList, RefreshControl } from 'react-native';
import { OverscrollView } from 'react-native-overscroll';

const MyComponent = () => {
  return (
    <OverscrollView bounce={true}>
      <FlatListWithRefresh />
    </OverscrollView>
  );
};

const FlatListWithRefresh = () => {
  const [data, setData] = useState(
    Array.from({ length: 20 }, (_, i) => `Item ${i + 1}`)
  );
  const [refreshing, setRefreshing] = useState(false);

  const onRefresh = useCallback(() => {
    setRefreshing(true);
    // 模拟数据刷新
    setTimeout(() => {
      // 更新数据，这里简单地重新生成了一份数据
      setData(Array.from({ length: 20 }, (_, i) => `新数据 Item ${i + 1}`));
      setRefreshing(false);
    }, 2000); // 模拟网络请求的延迟
  }, []);

  const renderItem = ({ item }: any) => (
    <View style={styles.item}>
      <Text style={{ color: 'black' }}>{item}</Text>
    </View>
  );

  return (
    <FlatList
      data={data}
      keyExtractor={(_item, index) => index.toString()}
      renderItem={renderItem}
      overScrollMode="always"
      refreshControl={
        <RefreshControl refreshing={refreshing} onRefresh={onRefresh} />
      }
    />
  );
};

const styles = StyleSheet.create({
  item: {
    padding: 16,
    borderBottomWidth: 1,
    borderBottomColor: '#ccc',
  },
  container: {
    flex: 1,
    marginTop: 50,
  },
  box: {
    height: 150,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: 'pink',
    marginVertical: 10,
  },
  text: {
    fontSize: 20,
    color: 'black',
  },
});

export default MyComponent;
