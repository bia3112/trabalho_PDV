PGDMP     4                    |            PDV    13.14    13.14 #    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    33321    PDV    DATABASE     e   CREATE DATABASE "PDV" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Portuguese_Brazil.1252';
    DROP DATABASE "PDV";
                postgres    false            �            1259    33507    cliente    TABLE     �   CREATE TABLE public.cliente (
    id integer NOT NULL,
    cpf character varying(255),
    nome character varying(255),
    telefone character varying(255)
);
    DROP TABLE public.cliente;
       public         heap    postgres    false            �            1259    33505    cliente_id_seq    SEQUENCE     �   CREATE SEQUENCE public.cliente_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.cliente_id_seq;
       public          postgres    false    201            �           0    0    cliente_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.cliente_id_seq OWNED BY public.cliente.id;
          public          postgres    false    200            �            1259    33518 	   itemvenda    TABLE     $  CREATE TABLE public.itemvenda (
    id integer NOT NULL,
    descontoun double precision NOT NULL,
    descricao character varying(255),
    qtd integer NOT NULL,
    vltotal double precision NOT NULL,
    vlunitario double precision NOT NULL,
    produto_id integer,
    venda_id integer
);
    DROP TABLE public.itemvenda;
       public         heap    postgres    false            �            1259    33516    itemvenda_id_seq    SEQUENCE     �   CREATE SEQUENCE public.itemvenda_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.itemvenda_id_seq;
       public          postgres    false    203            �           0    0    itemvenda_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.itemvenda_id_seq OWNED BY public.itemvenda.id;
          public          postgres    false    202            �            1259    33526    produto    TABLE     _   CREATE TABLE public.produto (
    id integer NOT NULL,
    descricao character varying(255)
);
    DROP TABLE public.produto;
       public         heap    postgres    false            �            1259    33524    produto_id_seq    SEQUENCE     �   CREATE SEQUENCE public.produto_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.produto_id_seq;
       public          postgres    false    205            �           0    0    produto_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.produto_id_seq OWNED BY public.produto.id;
          public          postgres    false    204            �            1259    33534    venda    TABLE     �   CREATE TABLE public.venda (
    id integer NOT NULL,
    descontototal double precision NOT NULL,
    qtdtotalitems integer NOT NULL,
    valortotal double precision NOT NULL,
    cliente_id integer
);
    DROP TABLE public.venda;
       public         heap    postgres    false            �            1259    33532    venda_id_seq    SEQUENCE     �   CREATE SEQUENCE public.venda_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.venda_id_seq;
       public          postgres    false    207            �           0    0    venda_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.venda_id_seq OWNED BY public.venda.id;
          public          postgres    false    206            5           2604    33510 
   cliente id    DEFAULT     h   ALTER TABLE ONLY public.cliente ALTER COLUMN id SET DEFAULT nextval('public.cliente_id_seq'::regclass);
 9   ALTER TABLE public.cliente ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    200    201    201            6           2604    33521    itemvenda id    DEFAULT     l   ALTER TABLE ONLY public.itemvenda ALTER COLUMN id SET DEFAULT nextval('public.itemvenda_id_seq'::regclass);
 ;   ALTER TABLE public.itemvenda ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    203    202    203            7           2604    33529 
   produto id    DEFAULT     h   ALTER TABLE ONLY public.produto ALTER COLUMN id SET DEFAULT nextval('public.produto_id_seq'::regclass);
 9   ALTER TABLE public.produto ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    205    204    205            8           2604    33537    venda id    DEFAULT     d   ALTER TABLE ONLY public.venda ALTER COLUMN id SET DEFAULT nextval('public.venda_id_seq'::regclass);
 7   ALTER TABLE public.venda ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    207    206    207            �          0    33507    cliente 
   TABLE DATA           :   COPY public.cliente (id, cpf, nome, telefone) FROM stdin;
    public          postgres    false    201   �%       �          0    33518 	   itemvenda 
   TABLE DATA           n   COPY public.itemvenda (id, descontoun, descricao, qtd, vltotal, vlunitario, produto_id, venda_id) FROM stdin;
    public          postgres    false    203   �&       �          0    33526    produto 
   TABLE DATA           0   COPY public.produto (id, descricao) FROM stdin;
    public          postgres    false    205   p'       �          0    33534    venda 
   TABLE DATA           Y   COPY public.venda (id, descontototal, qtdtotalitems, valortotal, cliente_id) FROM stdin;
    public          postgres    false    207   �'       �           0    0    cliente_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.cliente_id_seq', 8, true);
          public          postgres    false    200            �           0    0    itemvenda_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.itemvenda_id_seq', 10, true);
          public          postgres    false    202            �           0    0    produto_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.produto_id_seq', 9, true);
          public          postgres    false    204            �           0    0    venda_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.venda_id_seq', 5, true);
          public          postgres    false    206            :           2606    33515    cliente cliente_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.cliente DROP CONSTRAINT cliente_pkey;
       public            postgres    false    201            <           2606    33523    itemvenda itemvenda_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.itemvenda
    ADD CONSTRAINT itemvenda_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.itemvenda DROP CONSTRAINT itemvenda_pkey;
       public            postgres    false    203            >           2606    33531    produto produto_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.produto
    ADD CONSTRAINT produto_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.produto DROP CONSTRAINT produto_pkey;
       public            postgres    false    205            @           2606    33539    venda venda_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.venda
    ADD CONSTRAINT venda_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.venda DROP CONSTRAINT venda_pkey;
       public            postgres    false    207            A           2606    33540 %   itemvenda fk9gj4xujmorjybnpoeivijg8yo    FK CONSTRAINT     �   ALTER TABLE ONLY public.itemvenda
    ADD CONSTRAINT fk9gj4xujmorjybnpoeivijg8yo FOREIGN KEY (produto_id) REFERENCES public.produto(id);
 O   ALTER TABLE ONLY public.itemvenda DROP CONSTRAINT fk9gj4xujmorjybnpoeivijg8yo;
       public          postgres    false    2878    203    205            C           2606    33550 !   venda fkdofv694x76omty2jcr43wpi4y    FK CONSTRAINT     �   ALTER TABLE ONLY public.venda
    ADD CONSTRAINT fkdofv694x76omty2jcr43wpi4y FOREIGN KEY (cliente_id) REFERENCES public.cliente(id);
 K   ALTER TABLE ONLY public.venda DROP CONSTRAINT fkdofv694x76omty2jcr43wpi4y;
       public          postgres    false    207    2874    201            B           2606    33545 %   itemvenda fkn0kr2upuk6qhw34a49ibq6eji    FK CONSTRAINT     �   ALTER TABLE ONLY public.itemvenda
    ADD CONSTRAINT fkn0kr2upuk6qhw34a49ibq6eji FOREIGN KEY (venda_id) REFERENCES public.venda(id);
 O   ALTER TABLE ONLY public.itemvenda DROP CONSTRAINT fkn0kr2upuk6qhw34a49ibq6eji;
       public          postgres    false    2880    203    207            �   �   x�E�=n�0�g��AB�C�o���Eh�D������Qz�����������}��gX�e������x�K�e=�֦�!b/��*@O��6�S=�r�z��K^�A/R��&�{�c���z,�#���N�D��X!��F�3��-���X��{/0'Be�h�n�!�a�m��~��c*M!tz/f�(	�I��3�J�1�ֺ�!�N�&# )�`�yg��c:��O��*�%�&�¬>�R�8Q      �   �   x��1�0���9r�@���[�..�@B`�B�z.V��=���\Xt2sX�<��^P�1J��Zm��Jܿb�A��G�����0�Oˤh��kP�E�6E���C�D��3����א��%F�5�B��=
"�/�&�      �   o   x�3��MLN,*:�8�ˈ�9?9Q�9?'Q�Ї˘3��(�$�6�.M�WHIU-KT050���2�t,*ʯ�2�tK��`�d����9�`-��Y�\��Ήi�Wr��qqq |�$�      �   <   x����@�bm1?,\1�_&�(���0�Jn5fIZÉ�\T'�������˜�|C�y!

     