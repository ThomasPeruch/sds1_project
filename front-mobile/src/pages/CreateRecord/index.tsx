import React from 'react';
import { Text, StyleSheet, Easing } from 'react-native';
import Header from '../../components/Header';

const CreateRecord = () => {
    return(
        <>
            <Header/>
            <Text style={styles.text}>create-a-record</Text>
        </>
    )
}

const styles = StyleSheet.create({
    text: {
      color: '#FFF',
      fontSize: 50,
      textAlign : 'center',
      marginTop : 100
    }
  });
  
export default CreateRecord;