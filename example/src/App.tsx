import { StyleSheet, View } from 'react-native';
import { OverscrollView } from 'react-native-overscroll';

export default function App() {
  return (
    <View style={styles.container}>
      <OverscrollView bounce={false} style={styles.box} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
